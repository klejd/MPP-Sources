package prob6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transcript {
private List<TranscriptEntry> transcriptEntry= new ArrayList<>();
Transcript(){}

public List<TranscriptEntry> getTranscriptEntries() {
	return transcriptEntry;
}
public void addTranscriptEntry(LocalDate couseDate,String grade,Course course) {
	transcriptEntry.add(new TranscriptEntry(couseDate,grade,course));
}
}
