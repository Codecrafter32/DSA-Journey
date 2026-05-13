public class linearsearch1 {
    public static int linearsearch(String menu[],String key){

        for(int i=0;i<menu.length;i++){
            if (menu[i] == null ? key == null : menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       String menu[] = {"Dosa","Idli","Samosa","Sandwitch","Biriyani"};
        String key = "Dhokla";
        int index = linearsearch(menu, key);
        if(index == -1){
            System.out.println("Key is not found.");
        }
        else{
            System.out.println("key is found at: "+index);
        }
}
}