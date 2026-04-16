class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for(int i = 0; i<image.length; i++){
            int l = 0; 
            int r = image.length-1;

            while(l<=r){
                // reverse+ invert using xor opr

                int temp = image[i][l]^1;
                image[i][l] = image[i][r]^1;
                image[i][r] = temp;
                l++;
                r--;
                            }
        }
        return image;
    }
}
