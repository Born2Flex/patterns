package edu.internship.creational.prototype.document;

public class Report extends AbstractDocument {
    private String author;

    public Report() {
    }

    public Report(Report target) {
        super(target);
        if (target != null) {
            this.author = target.author;
        }
    }

    @Override
    public Document clone() {
        return new Report(this);
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Report) || !super.equals(object2)) return false;
        Report document2 = (Report) object2;
        return document2.author.equals(author);
    }

    @Override
    public String toString() {
        return "Report{" +
                "title='" + getTitle() + '\'' +
                ", content='" + getContent() + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

}
