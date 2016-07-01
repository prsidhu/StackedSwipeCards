package com.prsidhu.stackedswipecard;

/**
 * Created by DELL-PC on 01-07-2016.
 */
public class UsageStatisticsRecorder {
    private long starttime;
    private long endtime;
    private int leftattempts;
    private int rightattempts;
    private int topattempts;
    private boolean descriptionclicked;
    private static UsageStatisticsRecorder instance = null;

    public static UsageStatisticsRecorder getInstance()
    {
        if(instance == null)
        {
            instance = new UsageStatisticsRecorder();

        }
        return instance;
    }

    public static void clear()
    {
        instance = null;
    }

    public UsageStatisticsRecorder()
    {
        starttime = 0;
        endtime = 0;
        leftattempts = 0;
        rightattempts = 0;
        topattempts = 0;
        descriptionclicked = false;
    }

    public void resetStats()
    {
        starttime = 0;
        endtime = 0;
        leftattempts = 0;
        rightattempts = 0;
        topattempts = 0;
        descriptionclicked = false;
    }

    public void setStartTime(long time)
    {
        starttime = time;
    }

    public void setEndTime(long time)
    {
        endtime = time;
    }

    public void incrementLeftAttempts()
    {
        leftattempts++;
    }

    public void incrementRightAttempts()
    {
        rightattempts++;
    }

    public void incrementTopAttempts()
    {
        topattempts++;
    }

    public void setDescriptionClicked()
    {
        descriptionclicked = true;
    }

    public long timeSpent()
    {
        return endtime - starttime;
    }

    public int getLeftAttempts()
    {
        return leftattempts;
    }

    public int getRightAttempts()
    {
        return rightattempts;
    }

    public int getTopAttempts()
    {
        return topattempts;
    }

    public long getEndTime(){ return endtime;}

    public int getDescriptionClicked()
    {
        return (descriptionclicked == true)?1:0;
    }
}
