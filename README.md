# Hangman Game

## Short overview of the game

 - Playing the typical Hangman game
 - We show the player how many letters the word has
 - The Player has 11 guesses 
    - if he guesses on letter right we show him where the letter belongs in the word
    - if he guesses the letter wrong we start to draw the hangman. 
- The hangman has 11 parts, if we have drawn all 11 parts the Player lost the game
- If the Player guessed all the letters she/he wins



## Installation Guide

- You can use any Editor that supports Java.
- Download the folder
- Open it in your Editor as an existing source Folder to start the Program.

## How does the game work

 - The _start_ looks like this:
 
 - We print how many words the player has to guess then we start with the first word
    > HANGMEN (5 Word(s))
   > 
   > Word #1:
 - We show the player how many letters the word has
    >  Word: _ _ _ _ _ _ _ _ _ _
   > 
    > Misses (0/11)
    >
     > Next guess:
 - The player has **11 guesses**
 - The guess must be a letter
    - if it's not, we tell him that the input was invalid, and he has to guess again
    - if the player already guessed the letter, we tell her/him and she/he can guess again
- If the guess is wrong we add one part to the Hangman
   - We print the wrong guessed letters next to the mistake counter
 -  After every finished game round we print:
    -  **YOU WIN !** - if the Player won and guessed the word right
    -  **YOU LOSE !** - if the Player lost
- If the player guessed one letter right we exchange the **_** with the correct letter
- At the *end* of the game we show the player how many words he guessed right
    - **WINS: x/x**
 ----
- You can find a text-file **WordsForHangman.txt** where you can edit the words that the player must guess right
- Currently, there are 3 words in the file
    > butterfly
    ambulance
    cactus
- You can change them or add some new ones


#### Author
Lara Ulrich - Student at Campus02 Graz


#### Exercises 
- [Exercise1](exercise1.md)






   
