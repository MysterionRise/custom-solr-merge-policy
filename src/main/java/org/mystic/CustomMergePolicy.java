package org.mystic;

import org.apache.lucene.index.MergePolicy;
import org.apache.lucene.index.MergeTrigger;
import org.apache.lucene.index.SegmentCommitInfo;
import org.apache.lucene.index.SegmentInfos;

import java.io.IOException;
import java.util.Map;

public class CustomMergePolicy extends MergePolicy {

    @Override
    public MergeSpecification findMerges(MergeTrigger mergeTrigger, SegmentInfos segmentInfos, MergeContext mergeContext) throws IOException {
        return null;
    }

    @Override
    public MergeSpecification findForcedMerges(SegmentInfos segmentInfos, int i, Map<SegmentCommitInfo, Boolean> map, MergeContext mergeContext) throws IOException {
        return null;
    }

    @Override
    public MergeSpecification findForcedDeletesMerges(SegmentInfos segmentInfos, MergeContext mergeContext) throws IOException {
        return null;
    }
}
