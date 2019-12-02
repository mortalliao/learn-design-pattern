package win.mortalliao.java.design.pattern.chainofresponsibilty;

/**
 * @author Jim
 */
public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (course != null && course.getVideo() != null && !course.getVideo().trim().equals("")) {
            System.out.println(course.getName() + "含有视频, 批准");
            if (approver != null) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含有视频, 不批准, 流程结束");
            return;
        }
    }
}
