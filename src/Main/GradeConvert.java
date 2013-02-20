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
    public static int AnalyzeNum(int indexNum1, int indexNum2, int indexNum3, int indexNum4, int indexNum5, int indexNum6, int indexNum7, int indexNum8, int indexNum9) {
      int GradeCount = 9;
      if (indexNum1 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum2 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum3 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum4 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum5 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum6 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum7 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum8 == 0) {
          GradeCount = GradeCount - 1;
      }
      if (indexNum9 == 0) {
          GradeCount = GradeCount - 1;
      }
      return GradeCount;
  }
}
