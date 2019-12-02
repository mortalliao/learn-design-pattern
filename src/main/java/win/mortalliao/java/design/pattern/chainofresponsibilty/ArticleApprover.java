package win.mortalliao.java.design.pattern.chainofresponsibilty;

/**
 * @author Jim
 */
public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course != null && course.getArticle() != null && !course.getArticle().trim().equals("")) {
            System.out.println(course.getName() + "含有手记, 批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有手记, 不批准, 流程结束");
            return;
        }
    }
}
