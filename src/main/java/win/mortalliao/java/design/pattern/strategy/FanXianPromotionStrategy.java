package win.mortalliao.java.design.pattern.strategy;

/**
 * @author Jim
 */
public class FanXianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销,返回的金额存放至余额");
    }
}
