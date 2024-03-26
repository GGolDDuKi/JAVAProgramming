public class Game369 {
	
   public static void main(String[] args) {
      int ten = 0, one = 0;  
      
      for(int i = 1; i < 100; i++) {
         ten = i / 10;
         one = i % 10;
         
         //둘다 369일경우
         if((ten == 3 || ten == 6 || ten == 9) && (one ==3 || one == 6 || one == 9) ) {
            System.out.println(i + " 박수 짝짝");
         }
         //십의자리만 369일 경우
          else if((ten == 3 || ten == 6 || ten == 9) && (one !=3 || one != 6 || one != 9)) {
             System.out.println(i + " 박수 짝");
             }
         //일의자리만 369일 경우
          else if((ten != 3 || ten != 6 || ten != 9) && (one ==3 || one == 6 || one == 9)) {
             System.out.println(i + " 박수 짝");
          }
      }
   }
}