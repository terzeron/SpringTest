package net.terzeron.knight;

public interface IKnight {
	Object embarkOnQuest() throws QuestFailedException;
	String getName();
}
