package win.mortalliao.java.design.pattern.chainofresponsibilty;

/**
 * @author Jim
 */
public class Test {

    public static void main(String[] args) {
        Approver articleApprover = new ArticleApprover();
        Approver videonApprover = new VideoApprover();

        Course course = new Course();
        course.setName("课程名称");
        course.setArticle("课程手记");
        course.setVideo("课程视频");

        articleApprover.setNetApprover(videonApprover);

        articleApprover.deploy(course);
    }
}
