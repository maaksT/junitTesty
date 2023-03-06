package electricity;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ElectricityMeterTest {

    @Test
    public void addKwh() {

        ElectricityMeter electricityMater = new ElectricityMeter();
        electricityMater.addKwh(1);
        Assert.assertTrue(electricityMater.getKwh() == 1);

    }
}