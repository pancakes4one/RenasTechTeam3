package Hamsa;

import java.util.Arrays;

public class concat_arrays {

        //    (Array) Concat two arrays. Write a return method that can concat two arrays

        public static void main(String[] args) {

            int [] firstarr={3,5,1,7,8};
            int [] secondarr={5,7,9,2};
            int [] newarr=new int[firstarr.length+ secondarr.length];
            for(int i=0; i< firstarr.length;i++){
                newarr[i]=firstarr[i];
            }
            for(int j=0;j< secondarr.length;j++){
                newarr[(firstarr.length)+j]=secondarr[j];
            }
            System.out.println(Arrays.toString(firstarr));
            System.out.println(Arrays.toString(secondarr));
            System.out.println(Arrays.toString(newarr));
        }
    }


