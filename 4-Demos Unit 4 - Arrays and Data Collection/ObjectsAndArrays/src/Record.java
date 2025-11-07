public class Record {
    public String name;
    public int id;
    public int grade;

    public Record() {
        name = "";
        id = 0;
        grade = 0;
    }

    public Record(String tempName, int tempID, int tempGrade) {
        name = tempName;
        id = tempID;
        grade = tempGrade;
    }

}
