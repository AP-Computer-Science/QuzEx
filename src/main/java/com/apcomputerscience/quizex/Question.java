package com.apcomputerscience.quizex;

//********************************************************************
//  Question.java       Author: Lewis/Loftus/Cocking
//
//  Represents a question (and its answer).
//********************************************************************
public class Question implements Complexity, Comparable
{
   private String question, answer, why;
   private int complexityLevel;
   private boolean correct = false;
   //-----------------------------------------------------------------
   //  Sets up the question with a default complexity.
   //-----------------------------------------------------------------
   public Question (String query, String result, String w)
   {
      question = query;
      answer = result;
      complexityLevel = 1;
      why = w;
   }
   public Question (String query, String result, int c, String w)
   {
      question = query;
      answer = result;
      complexityLevel = c;
      why = w;
   }
   //-----------------------------------------------------------------
   //  Sets the complexity level for this question.
   //-----------------------------------------------------------------
   public void setComplexity (int level)
   {
      complexityLevel = level;
   }
   public String getWhy() {
       return why;
   }
   //-----------------------------------------------------------------
   //  Returns the complexity level for this question.
   //-----------------------------------------------------------------
   public int getComplexity()
{
      return complexityLevel;
}
   //-----------------------------------------------------------------
   //  Returns the question.
   //-----------------------------------------------------------------
   public String getQuestion()
{
      return question;
}
   //-----------------------------------------------------------------
   //  Returns the answer to this question.
   //-----------------------------------------------------------------
   public String getAnswer()
   {
      return answer;
   }
   //-----------------------------------------------------------------
   //  Returns true if the candidate answer matches the answer.
   //-----------------------------------------------------------------
   public boolean answerCorrect (String candidateAnswer)
   {
      correct = answer.equals(candidateAnswer);
      return correct;
   }
   public boolean isCorrect() {
       return correct;
   }
   //-----------------------------------------------------------------
   //  Returns this question (and its answer) as a string.
   //-----------------------------------------------------------------
   public String toString()
   {
      return question + "\n" + answer;
   }

    @Override
    public int compareTo(Object t) {
        return this.getComplexity() - ((Question)t).getComplexity();
    }
}
