public class Game369 {
	
   public static void main(String[] args) {
      int ten = 0, one = 0;  
      
      for(int i = 1; i < 100; i++) {
         ten = i / 10;
         one = i % 10;
         
         //�Ѵ� 369�ϰ��
         if((ten == 3 || ten == 6 || ten == 9) && (one ==3 || one == 6 || one == 9) ) {
            System.out.println(i + " �ڼ� ¦¦");
         }
         //�����ڸ��� 369�� ���
          else if((ten == 3 || ten == 6 || ten == 9) && (one !=3 || one != 6 || one != 9)) {
             System.out.println(i + " �ڼ� ¦");
             }
         //�����ڸ��� 369�� ���
          else if((ten != 3 || ten != 6 || ten != 9) && (one ==3 || one == 6 || one == 9)) {
             System.out.println(i + " �ڼ� ¦");
          }
      }
   }
}