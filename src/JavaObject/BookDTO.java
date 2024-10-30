package JavaObject;
import Practice.Array;

import java.util.ArrayList;
public class BookDTO {
    ArrayList<String> Book;
    public BookDTO() {
        Book = new ArrayList<>();
    }


    public void addData(String data){
        Book.add(data);
        System.out.println("데이터가 저장되었습니다: "+data);
    }

    //저장된 데이터를 반환하는 메소드
    public ArrayList<String> getBook(){
        return Book;
    }

    //특정 인덱스의 데이터를 삭제하는 메소드
    public void removeData(int index){
        if(index >= 0 && index < Book.size()) {
            String data = Book.remove(index);
            System.out.println("삭제된 데이터: " + data);
        } else{
            System.out.println("유효하지 않은 인덱스입니다");
        }
    }

    //특정 인덱스의 데이터를 수정하는 메소드

    public void updateData(int index, String data){
        if(index >= 0 && index < Book.size()) {
            String oldData = Book.get(index);
            System.out.println("수정된 데이터: " + oldData + "->" + data);
        }
        else{
            System.out.println("유효하지 않은 인덱스입니다");
        }
    }




}
