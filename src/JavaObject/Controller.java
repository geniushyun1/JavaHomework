package JavaObject;
import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;
class Controller {

}
//도서정보추가
 class AddBook{
   public BookDTO bookdto;

   public AddBook(BookDTO bookdto) {
       this.bookdto = bookdto;
   }

    public void inputData(){
       Scanner sc = new Scanner(System.in);
       System.out.print("저장할 책의 정보를 입력하세요: (종료하려면 'exit' 입력) ");

       while(true) {
           String input = sc.nextLine();
           if (input.equals("exit")) {
               System.out.println("입력을 종료합니다");
               break;
           }
           bookdto.addData(input);
           System.out.print("저장할 책의 정보를 입력하세요 (종료하려면 exit 입력): ");
       }

       }
    }
//책의 정보를 조회 할 수 있는 클래스
class FindBook{
    private BookDTO bookdto;

    public FindBook(BookDTO bookdto) {
        this.bookdto = bookdto;
    }

    //저장된 데이터를 출력하는 메소드
    public void printData(){
        System.out.println("저장된 데이터 목록: ");
        for(String data:bookdto.getBook()){
            System.out.println(data);
        }
    }




}


//책을 삭제 할 수 있는 클래스
class DeleteBook{
    private BookDTO bookdto;

    public DeleteBook(BookDTO bookdto) {
        this.bookdto = bookdto;

    }

    public void removeDataIndex(){
        Scanner sc = new Scanner(System.in);
        System.out.print("삭제할 데이터의 인덱스를 입력하세요: ");

        int index = sc.nextInt();
        bookdto.removeData(index);

    }

}

//책의 정보를 수정 할 수 있는 클래스
class ReviseBook{
    private BookDTO bookdto;

    public ReviseBook(BookDTO bookdto) {
        this.bookdto = bookdto;
    }

    //사용자로부터 수정할 인데그와 새로운 데이터를 입력받아 수정
    public void reviseData(){
        Scanner sc = new Scanner(System.in);
        System.out.print("수정할 책의 인덱스를 입력하요: ");
        int index = sc.nextInt();

        System.out.print("책의 새로운 데이터를 입력하세요: ");
        String newData = sc.nextLine();

        bookdto.updateData(index, newData);

    }

}




