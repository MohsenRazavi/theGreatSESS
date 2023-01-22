package Code;

public class Course {
    private String name;
    private String syllabus;
    private String reference;
    private Date midExamDate;
    private Date finalExamDate;
    public Course(){}
    public Course(String name, String syllabus, String reference, Date midExamDate, Date finalExamDate){
        this.setName(name);
        this.setSyllabus(syllabus);
        this.setReference(reference);
        this.setMidExamDate(midExamDate);
        this.setFinalExamDate(finalExamDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSyllabus() {
        return syllabus;
    }

    public void setSyllabus(String syllabus) {
        this.syllabus = syllabus;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Date getMidExamDate() {
        return midExamDate;
    }

    public void setMidExamDate(Date midExamDate) {
        this.midExamDate = midExamDate;
    }

    public Date getFinalExamDate() {
        return finalExamDate;
    }

    public void setFinalExamDate(Date finalExamDate) {
        this.finalExamDate = finalExamDate;
    }
}
