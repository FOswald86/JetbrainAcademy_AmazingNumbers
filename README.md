# JetbrainAcademy_AmazingNumber

In this project, you can learn a lot about algorithm combined with handling numbers. 
  
Supported requests:  
enter a natural number to know its properties  
enter two natural numbers to obtain the properties of the list  
* the first parameter represents a starting number  
* the second parameter shows how many consecutive numbers are to be printed  
- two natural numbers and properties to search for  
- a property preceded by minus must not be present in numbers  
- separate the parameters with one space  
- enter 0 to exit.  

Available properties: even, odd, buzz, duck, palindromic, gapful, spy, square, sunny, jumping, happy, sad,  
                      -even, -odd, -buzz, -duck, -palindromic, -gapful, -spy, -square, -sunny, -jumping, -happy, -sad  

<img src="https://github.com/FOswald86/JetbrainAcademy_AmazingNumbers/blob/main/AmazingNumbers.gif" width="800" height="500" />  

https://hyperskill.org/projects/184  


Buzz numbers. They are numbers that are either divisible by 7 or end with 7. For example, the number 14 is a buzz number,
 since it is divisible by 7 without a remainder; the number 17 ends with 7, so it is also a buzz number.
 However, the number 75 is not a Buzz number, since it is neither divisible by 7 nor does it end with 7.
 The number 7 is a Buzz number too.  
   
Duck number. A Duck number is a positive number that contains zeroes. For example, 3210, 8050896, 70709 are Duck numbers.
 Note that a number with a leading 0 is not a Duck number. So, numbers like 035 or 0212 are not Duck numbers. Although,
 01203 is a Duck, since it has a trailing 0.  
   
Gapful numbers. It is a number that contains at least 3 digits and is divisible by the concatenation of its first
 and last digit without a remainder. 12 is not a Gapful number, as it has only two digits. 132 is a Gapful number,
 as 132 % 12 == 0. 7881 is another example of a Gapful number, as 7881 % 71 == 0.  
   
a happy number is a number that reaches 1 after a sequence during which the number is replaced by the sum of each digit squares. For example, 13 is a happy number, as 12 + 32 = 10 which leads to 12 + 02 = 1. On the other hand, 4 is not a happy number because the sequence starts with 42 = 16, 12 + 62 = 37, and finally reaches 22 + 02 = 4. This is the number that started the sequence, so the process goes on in an infinite cycle. A number that is not happy is called Sad (or Unhappy).  
  
A number is a Jumping number if the adjacent digits inside the number differ by 1.
 The difference between 9 and 0 is not considered as 1. Single-digit numbers are considered Jumping numbers.
 For example, 78987, and 4343456 are Jumping numbers, but 796 and 89098 are not.  
   
A Palindromic number is symmetrical; in other words, it stays the same regardless of whether we read it from left or right.
 For example, 17371 is a palindromic number. 5 is also a palindromic number. 1234 is not. If read it from right,
 it becomes 4321. Add this new property to our program.  
   
Spy number. A number is said to be Spy if the sum of all digits is equal to the product of all digits.  
  
a square number or a perfect square is an integer that is the square of an integer; in other words, it is the
 product of an integer with itself. For example, 9 is a square number, since it equals 32 and can be written as 3??3.  
   
 N is a sunny number if N+1 is a perfect square number. In mathematics, a square number or a perfect square is an
 integer that is the square of an integer; in other words, it is the product of an integer with itself. For example,
 9 is a square number, since it equals 32 and can be written as 3??3.   
