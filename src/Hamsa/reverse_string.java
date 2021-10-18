package Hamsa;

    public class reverse_string {
        //    (String) Reverse
//    Write a return method that can reverse  String
//
//    Ex: Reverse("ABCDE"); ==> EDCBA
        public static void main(String[] args) {

            String beReverse = "ABCDE";
            String afReverse="";

            for(int i=(beReverse.length()-1);i>=0;i--){
                afReverse+=beReverse.charAt(i);
            }
            System.out.println("beReverse = " + beReverse);
            System.out.println("afReverse = " + afReverse);

        }
    }


