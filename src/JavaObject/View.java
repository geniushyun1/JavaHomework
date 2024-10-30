package JavaObject;
import java.awt.print.Book;
import java.util.Scanner;
import java.util.ArrayList;
public class View {
    public static void main(String[] args) {
        BookDTO bookDTO  = new BookDTO();
        AddBook book = new AddBook(bookDTO);
        FindBook book2 = new FindBook(bookDTO);
        DeleteBook book3 = new DeleteBook(bookDTO);
        ReviseBook book4 = new ReviseBook(bookDTO);


        //메인 실행 클래스
        System.out.println("========도서 관리 시스템=======");
        System.out.println("Menu: 1.도서정보 추가 2.조회 3.삭제 4.수정 5.출력");
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("Menu를 입력하세요: ");
            int menu = input.nextInt();
            if (menu == 1) { //책의 정보를 삽입
                book.inputData();

            }
            if(menu == 2) { // 저장된 책의 정보 조회
               book2.printData();

            }

            if(menu == 3) { //저장된 책 삭제(지정삭제)
                book3.removeDataIndex();

            }

            if(menu == 4) { //저장된 책 수정
                book4.reviseData();

            }

            if(menu == 5) {
                book2.printData();

            }

        }
    }
}
