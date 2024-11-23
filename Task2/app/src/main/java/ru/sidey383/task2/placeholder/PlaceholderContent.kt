package ru.sidey383.task2.placeholder

import ru.sidey383.task2.R

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 *
 */
object PlaceholderContent {

    /**
     * An array of sample (placeholder) items.
     */
    val ITEMS: MutableList<PlaceholderItem>

    private const val COUNT = 25

    init {
        ITEMS = ArrayList()
        for (i in 1..COUNT) {
            addItem(createPlaceholderItem())
        }
    }

    private fun addItem(item: PlaceholderItem) {
        ITEMS.add(item)
    }

    private fun createPlaceholderItem(): PlaceholderItem {
        return PlaceholderItem(
            R.drawable.album_cover,
            R.string.song_name,
            R.string.song_author
        )
    }

    data class PlaceholderItem(val image: Int, val song: Int, val author: Int) {
        override fun toString(): String {
            return "PlaceholderItem(image=$image, song='$song', author='$author')"
        }
    }
}