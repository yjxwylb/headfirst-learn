import com.xyj.learn.headfirst.strategypattern.Duck;
import com.xyj.learn.headfirst.strategypattern.FlyWithRocketPowered;
import com.xyj.learn.headfirst.strategypattern.MallardDuck;
import com.xyj.learn.headfirst.strategypattern.ModelDuck;
import org.junit.Test;

/**
 * @author: xiayuejie
 * @date: 2018/10/22 15:19
 * @description:
 */
public class TestPattern {

    @Test
    public void test01(){
        Duck duck = new MallardDuck();
        duck.performFly();
        duck.performQuack();
    }

    @Test
    public void test02(){
        Duck duck = new ModelDuck();
        duck.performFly();
        duck.setFlyBehavior(new FlyWithRocketPowered());
        duck.performFly();
        duck.performQuack();
    }
}
