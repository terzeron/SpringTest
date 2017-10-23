package net.terzeron.spring.knight;

public interface IQuest {
	abstract Object embark() throws QuestFailedException;
}
