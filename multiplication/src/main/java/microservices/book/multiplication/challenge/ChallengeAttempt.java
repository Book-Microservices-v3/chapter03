package microservices.book.multiplication.challenge;

import microservices.book.multiplication.user.User;

/**
 * Identifies the attempt from a {@link User} to solve a challenge.
 */
public record ChallengeAttempt(Long id, User user, int factorA, int factorB, int resultAttempt, boolean correct) {
}