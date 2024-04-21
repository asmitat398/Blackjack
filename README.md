# Black Jack

This project contains the code for the game Black Jack (Card Game)

This project contains 4 modules:

1.GameApp.java: This module contains "main" function, from where everything begins. By runing this code it will create an object which act as a player playing with the Dealer.
-If a player's hand exceeds 21 points, they bust and lose their bet.
-If a player's hand is closer to 21 than the dealer's hand without exceeding 21, the player wins and is paid out at even money (1:1).
-If the player's hand is the same value as the dealer's hand, it's a tie, and the player's bet is returned.
-If the player's hand is lower than the dealer's hand, the player loses their bet.
-If the player is dealt an Ace and a 10-value card (10, Jack, Queen, King) as their first two cards, they have a "blackjack" or "natural" and usually win at higher odds (often 3:2).
-If the dealer's face-up card is an Ace, players are given the option to purchase insurance, which is a side bet that pays out 2:1 if the dealer has a blackjack.

2.Game.java: This module contains various class which contains the rule of the game.
-Each player, including the dealer, is dealt two cards initially. The dealer's first card is typically dealt face-up, while the second card (the "hole" card) is dealt face-down.
-Players take turns deciding whether to "hit" (take another card) or "stand" (keep their current hand).
-Players can also choose to "double down," doubling their initial bet and receiving exactly one additional card.
-If a player's first two cards are of equal value, they can choose to "split" the pair into two separate hands, each with its own bet.
-Once all players have completed their turns, the dealer reveals their hole card and plays their hand according to predetermined rules, usually hitting until their hand reaches a certain total (often 17 or higher).

3.Deck.java: This module contains the shuffling function and, various cards present in the Deck.

4.Card.java: This module contains the value of all the cards.
-Cards 2 through 10 are worth their face value.
-Face cards (Jack, Queen, King) are each worth 10 points.
-Aces can be worth either 1 point or 11 points, depending on which value benefits the player's hand the most.
