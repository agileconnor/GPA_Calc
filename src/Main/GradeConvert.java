/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Connor
 */
public class GradeConvert {
    
    /**
     *
     * @param GradeIn
     * @return GPAOut
     */
    public static float Convert(int GradeIn) {
        float GPAOut = 0;
        if (GradeIn == 1 || GradeIn == 2) {
           GPAOut = 4; 
        }
        if (GradeIn == 3) {
            GPAOut = 3.7f;
        }
        if (GradeIn == 4) {
            GPAOut = 3.3f;
        }
        if (GradeIn == 5) {
            GPAOut = 3;
        }
        if (GradeIn == 6) {
            GPAOut = 2.7f;
        }
        if (GradeIn == 7) {
            GPAOut = 2.3f;
        }
        if (GradeIn == 8) {
            GPAOut = 2;
        }
        if (GradeIn == 9) {
            GPAOut = 1.7f;
        }
        if (GradeIn == 10) {
            GPAOut = 1.3f;
        }
        if (GradeIn == 11) {
            GPAOut = 1;
        }
        if (GradeIn == 12) {
            GPAOut = .7f;
        }
        return GPAOut;
    }
  public static boolean Analyze(int indexNum) {
      boolean isGrade = true;
      if (indexNum == 0) {
          isGrade = false;
      }
      return isGrade;
  }
}
