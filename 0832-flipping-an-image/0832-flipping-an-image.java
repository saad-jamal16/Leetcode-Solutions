class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
                for (int i=0; i<image.length; i++) {
            // Swapping right and left element with XOR of current element.
            for (int j=0; j<image[0].length/2; j++){
                int temp = image[i][j] ^ 1;
                image[i][j] = image[i][image[i].length-1-j] ^ 1;
                image[i][image[i].length-1-j] = temp;
            }
            //If image[][] length is odd.
            if (image[i].length % 2 != 0) {
                image[i][image[i].length/2] = image[i][image[i].length/2] ^ 1;
            }
        }
        return image;

    }
}