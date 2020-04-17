import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
  public static void main(String[] args){
    Result result = JUnitCore.runClasses(TestCase.class);
      System.out.println("RunTime: " +result.getRunTime() + " ms");
    if(!result.wasSuccessful()){
      System.out.println("There is "+result.getFailureCount() +" failure over " +result.getRunCount() + " tests Case");
      for(Failure failure : result.getFailures()){
        System.out.println(failure.toString());
      }
    }
    else{
      System.out.println("All tests Pass");
      System.out.println("RunTime: " +result.getRunTime() + " ms");
    }
  }
}
