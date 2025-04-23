# Number Guessing Game

## Description

**NumberGuessingGame** is a fun and interactive Java console application where the player tries to guess a randomly generated number between 1 and 10. The player is given a limited number of attempts (3 tries) to guess the correct number.

## Features

- Generates a random number between 1 and 10.
- Prompts the user to guess the number.
- Provides up to 3 attempts to guess correctly.
- Displays appropriate messages based on the user’s input:
  - Congratulates the user for a correct guess.
  - Encourages the user to try again on wrong guesses.
  - Reveals the correct number if all attempts are used.

## Requirements

- Java 8 or higher

## How to Run

1. Save the code in a file named `NumberGuessingGame.java`.
2. Open your terminal or command prompt and navigate to the file’s directory.
3. Compile the program:
   ```bash
   javac NumberGuessingGame.java
   ```
4. Run the program:
   ```bash
   java NumberGuessingGame
   ```

## Example Output

```
Welcome to the Number Guessing Game!
Guess a number between 1 and 10
You have 3 attempts. Good Luck!
Attempt1: Enter your Guess: 
5
Wrong Guess
Try Again!
Attempt2: Enter your Guess: 
7
Wrong Guess
Try Again!
Attempt3: Enter your Guess: 
3
Wrong Guess
You've used all attempts. The correct number was: 9
```

Or, if the user guesses correctly:

```
Attempt2: Enter your Guess: 
4
Congratulations! You guessed the correct number
```

## Notes

- The random number is generated using `Math.random() * 11`, which produces a number between 0 and 10. You may want to ensure it stays between 1 and 10 for consistency by changing it to:
  ```java
  int targetNumber = random.nextInt(10) + 1;
  ```

## License

This project is licensed under the MIT License.
