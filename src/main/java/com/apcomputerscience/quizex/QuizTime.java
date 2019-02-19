package com.apcomputerscience.quizex;

import org.fusesource.jansi.AnsiConsole;

public class QuizTime {
    public static void main(String[] args) {
        AnsiConsole.systemInstall();
        Quiz q = new Quiz(8);
        q.addQuestion(new Question("Given the integers of 101 (Base 2) + BF (Base 16). What is the value when converted to base 10?", "196", 4,
                                    "101 = 5, BF = 191, 5 + 191 = 196."));
        q.addQuestion(new Question("Consider the following number (Base 2): 1001101. What would the new value be when the ~ operator is applied?", "0110010", 5,
                                    "The ~ operator is one's complement, therefore it will flip all the bits."));
        q.addQuestion(new Question("True or false: An AES initialization vector should be secured along with the private key.", "F", 2,
                                    "An IV prevents duplicate cypher text from being producing when using the same key, therefore it is not necessary to protect it."));
        q.addQuestion(new Question("True or false: A bit shift is fast because it utilizes the CPU's bit register.", "T", 8,
                                    "There is a bit register in an x86 CPU."));
        q.addQuestion(new Question("True or false: Modular arithmetic is used in RSA encryption.", "T", 7,
                                    "Modular arithmetic is used to encrypt and decrypt data by using large prime numbers."));
        q.addQuestion(new Question("True or false: Interrupt 16h provides mouse support.", "F", 9,
                                    "Interrupt 16h handles keyboard input."));
        q.addQuestion(new Question("Tim is creating a mini computer using an EPROM IC. If he needs to reprogram his computer, what should he do?"
                                  + "\n"
                                  + "A. Make the flash pin high.\n"
                                  + "B. Put it under the sun.\n"
                                  + "C. Solder a new chip on the old package.", "B", 1,
                                    "An EPROM can be re-programmed by putting it under strong UV light."));
        q.addQuestion(new Question("Consider the following code of an animal simulation.\n\n" +
                                    "public enum AnimalCharacteristics {\n" +
                                    "\tHasFur = 1;\n" +
                                    "\tIsCute << 1;\n" +
                                    "\tPlayful << 2;\n" +
                                    "\tNoisy << 3;\n" +
                                    "}\n" +
                                    "public static void main(String args[]) {\n" +
                                    "\tAnimalCharacteristics catChar = AnimalCharacteristics.Playful | AnimalCharacteristics.HasFur;\n" +
                                    "\tif(catChar & AnimalCharacteristics.Playful == true) System.out.println(\"I Love playful kitties!\")\n" +
                                    "}\n\n" +
                                    "Will this work?\n\n" +
                                    "A. Yes, because an enum's value is a power of two, therefore it serves as bit flags.\n" +
                                    "B. Yes, because catChar has the bit \'AnimalCharacteristics.Playful\' set, therefore & will evaluate to true.\n" +
                                    "C. No, because a bit flag needs to be a power of two and the << operator only shifts the bits.\n" +
                                    "D. No, because the & operator returns an int, not a boolean.", "D", 9,
                                    "AnimalCharacteristics represents a bit-flag by shifting each flag by a power of two (01 = 10 == 100 = 1000). You use the bit-wise & operator to determine if a sepcific bit has been set."));
        q.giveQuiz();
    }
}