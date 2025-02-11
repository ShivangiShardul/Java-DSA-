package Array.Searching.Linear_Search;

import java.util.Arrays;

class SearchInStrings {
    public static void main(String[] args) {
        String name = "Manik";
        char target = 'n';

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(search(name,target));
    }

    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }

//    static boolean search1(String str,char target){
//        if(str.length() == 0){
//            return false;
//        }
//
//        for(char ch : str.toCharArray()){
//            if (ch == target){
//                return true;
//            }
//        }
//        return false;
//    }
}
