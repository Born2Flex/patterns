    package edu.internship.creational.prototype.document;

public abstract class AbstractDocument implements Document {
    private String title;
    private String content;

    public AbstractDocument() {
    }

    public AbstractDocument(AbstractDocument target) {
        if (target != null) {
            this.title = target.title;
            this.content = target.content;
        }
    }

    @Override
    public abstract Document clone();

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof AbstractDocument)) return false;
        AbstractDocument document2 = (AbstractDocument) object2;
        return document2.title.equals(title) && document2.content.equals(content);
    }

    @Override
    public String toString() {
        return "AbstractDocument{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
