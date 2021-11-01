//package Jessicca.study;
//
//public class kissPrinciple {
//
//    // below is a violation of the KISS principle
//    // code should be 40-50 lines and simple to understand, bite-sized
//
//    int day;
//    String days;
//
//    public static void main(String[] args) {
//
//        public String weekday1 (int day){
//            switch (day) {
//                case 1:
//                    return "Monday";
//                case 2:
//                    return "Tuesday";
//                case 3:
//                    return "Wednesday";
//                case 4:
//                    return "Thursday";
//                case 5:
//                    return "Friday";
//                case 6:
//                    return "Saturday";
//                case 7:
//                    return "Sunday";
//                default:
//                    throw new InvalidOperationException("day must be in range 1 to 7");
//            }
//        }
//
//        public String weekday2 (int day){
//            if ((day < 1) || (day > 7)) throw new InvalidOperationException("day must be in range 1 to 7");
//
//            string[] days = {
//                    "Monday",
//                    "Tuesday",
//                    "Wednesday",
//                    "Thursday",
//                    "Friday",
//                    "Saturday",
//                    "Sunday"
//            };
//            return days[day - 1];
//        }
//    }
//}
