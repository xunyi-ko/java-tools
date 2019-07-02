public class Arrays{
    public void displayTwoDimensionArray(int[][] array){
        if(array == null){
            System.out.println("Is a null");
            return;
        }
        int size = array.length;
		
		if(size == 0){
            System.out.println("Is a empty array");
			return ;
		}
		
		int length = array[0].length;
		
		for(int i = 0; i < size; i++){
			for(int j = 0; j < length; j++){
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
    }
}
