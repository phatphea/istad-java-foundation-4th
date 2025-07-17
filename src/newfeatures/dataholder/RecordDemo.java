package newfeatures.dataholder;

public class RecordDemo {

    public static void main(String[] args) {
        StudentDTO studentDTO = new StudentDTO(1L, "Phea", 100.0);

        System.out.println(studentDTO.id());
        System.out.println(studentDTO.name());
        System.out.println(studentDTO.score());
    }

}
