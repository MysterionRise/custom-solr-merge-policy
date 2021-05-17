package org.mystic;

import org.apache.lucene.index.MergeTrigger;
import org.apache.lucene.index.SegmentCommitInfo;
import org.apache.lucene.index.SegmentInfos;

import java.io.IOException;
import java.util.Map;

public class ForceLogMergePolicy extends CustomMergePolicy {
    @Override
    public MergeSpecification findMerges(MergeTrigger mergeTrigger, SegmentInfos segmentInfos, MergeContext mergeContext) throws IOException {
        return super.findMerges(mergeTrigger, segmentInfos, mergeContext);
    }

    @Override
    public MergeSpecification findForcedMerges(SegmentInfos segmentInfos, int i, Map<SegmentCommitInfo, Boolean> map, MergeContext mergeContext) throws IOException {
        return super.findForcedMerges(segmentInfos, i, map, mergeContext);
    }

    @Override
    public MergeSpecification findForcedDeletesMerges(SegmentInfos segmentInfos, MergeContext mergeContext) throws IOException {
        return super.findForcedDeletesMerges(segmentInfos, mergeContext);
    }
}
