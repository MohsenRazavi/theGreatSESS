package Code;

public class Term {
    private String name;
    private Date submitScoresDate;
    private Date startDate;
    private Date endDate;

    public Term(){}
    public Term(String name, Date submitScoresDate, Date startDate, Date endDate){
        this.setName(name);
        this.setSubmitScoresDate(submitScoresDate);
        this.setStartDate(startDate);
        this.setEndDate(endDate);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSubmitScoresDate() {
        return submitScoresDate;
    }

    public void setSubmitScoresDate(Date submitScoresDate) {
        this.submitScoresDate = submitScoresDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
