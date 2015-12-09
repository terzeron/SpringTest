package net.terzeron.knight;

public interface IQuest {
	abstract Object embark() throws QuestFailedException;
}
