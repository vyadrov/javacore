package vyadrov.HomeworkLesson5;


import com.vyadrov.lessons.Lesson_5.RightAngledTriangle;
import org.junit.Assert;
import org.junit.Test;

public class TestHomeworkLesson5 {
    @Test
    public void TesrightAngledTriangleCheck(){
        double a = 3, b = 4, c = 5;
        //double actualResult = RightAngledTriangle.rightAngledTriangleCheck(a,b);
        //Assert.assertEquals(Double.doubleToLongBits(c), Double.doubleToLongBits(actualResult));
        Assert.assertEquals(c, RightAngledTriangle.rightAngledTriangleCheck(a, b), 1e-9);


    }
}
