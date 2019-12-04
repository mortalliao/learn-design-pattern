package win.mortalliao.java.design.pattern.strategy;

/**
 * @author Jim
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销活动");
    }
}
