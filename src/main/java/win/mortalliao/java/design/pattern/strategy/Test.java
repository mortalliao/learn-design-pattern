package win.mortalliao.java.design.pattern.strategy;

/**
 * @author Jim
 */
public class Test {
//    public static void main(String[] args) {
//        PromotionActivity promotionActivity1111 = new PromotionActivity(new LiJianPromotionStrategy());
//        PromotionActivity promotionActivity1212 = new PromotionActivity(new FanXianPromotionStrategy());
//
//        promotionActivity1111.executePromotionStrategy();
//        promotionActivity1212.executePromotionStrategy();
//    }

//    public static void main(String[] args) {
//        PromotionActivity promotionActivity = null;
//
//        String promotionKey = "LIJIAN";
//
//        if (promotionKey.equals("LIJIAN")) {
//            promotionActivity = new PromotionActivity(new LiJianPromotionStrategy());
//        } else if (promotionKey.equals("FANXIAN")) {
//            promotionActivity = new PromotionActivity(new FanXianPromotionStrategy());
//        }//....
//
//        promotionActivity.executePromotionStrategy();
//    }

    public static void main(String[] args) {
        String promotionKey = "LIJIAN";

        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));

        promotionActivity.executePromotionStrategy();

    }
}
