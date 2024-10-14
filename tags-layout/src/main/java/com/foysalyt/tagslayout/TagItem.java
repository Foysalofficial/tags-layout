package com.foysalyt.tagslayout;

public class TagItem {
    private Object tagID;
    private String tagText;
    private String selectedBackgroundColor;
    private String selectedTextColor;
    private boolean isSelected;

    
    public TagItem(Object tagID, String tagText, String selectedBackgroundColor, String selectedTextColor, boolean isSelected) {
        this.tagID = tagID;
        this.tagText = tagText;
        this.selectedBackgroundColor = selectedBackgroundColor;
        this.selectedTextColor = selectedTextColor;
        this.isSelected = isSelected;
    }

    public TagItem(Object tagID, String tagText, String selectedBackgroundColor, boolean isSelected) {
        this.tagID = tagID;
        this.tagText = tagText;
        this.selectedBackgroundColor = selectedBackgroundColor;
        this.isSelected = isSelected;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public Object getTagID() {
        return tagID;
    }

    public String getTagText() {
        return tagText;
    }

    public String getSelectedBackgroundColor() {
        return selectedBackgroundColor;
    }

    public String getSelectedTextColor() {
        return selectedTextColor;
    }
}
