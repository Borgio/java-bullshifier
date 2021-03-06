package helpers;

import java.util.Random;
import java.util.Calendar;
import java.util.Date;

public class SimpleConfig extends Config {
	public static Random rand = new Random();

	public static Random getRandom() {
		return rand;
	}

	public boolean shouldThrow1000() {
		return false;
	}

	public boolean shouldThrowIllegal(Context context) {
		return context.counter > 20;
	}

	public boolean shouldThrowIO(Context context) {
		return false;
	}

	public boolean shouldWriteLogInfo(Context context) {
		return true;
	}

	public boolean shouldWriteLogWarn(Context context) {
		return context.counter % 5 == 0;
	}

	public boolean shouldWriteLogError(Context context) {
		return context.counter % 8 == 0;
	}

	public boolean shouldSuicide() {
		return false;
	}

	public boolean shouldRunAway(Context context) {
		return false;
	}

	public boolean shouldThrowSomething(int methodId, int classId) {
		return true;
	}

	public boolean shouldDoIoCpuIntensiveLogic(Context context) {
		return context.counter % 6 == 0;
	}

	public void updateContext(Context context) {
		context.counter++;
	}
}
