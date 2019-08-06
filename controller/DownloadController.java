
@RequestMapping("/download")
public class DownloadController{
    @RequestMapping(value = "/file")
    public ResponseEntity<InputStreamResource> downloadFile(String fileName, String url) throws IOException {
        URL url2 = new URL(url);
        // 字节输入流
        InputStream inputStream = url2.openStream();

        /*
         * 构造响应的头
         */
        HttpHeaders headers = new HttpHeaders();
        // 下载之后需要在请求头中放置文件名，该文件名按照ISO_8859_1编码。
        String filenames = new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1);
        headers.setContentDispositionFormData("attachment", filenames);
        response.addHeader("content-type", "application/octet-stream");

        return ResponseEntity.ok().headers(headers).contentLength(inputStream.available()).contentType(MediaType.parseMediaType("application/octet-stream;charset=utf-8")).body(new InputStreamResource(inputStream));
    }
}
