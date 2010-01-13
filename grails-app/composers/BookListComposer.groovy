import org.zkoss.zkgrails.*
import org.zkoss.zkplus.databind.BindingListModelList

class BookListComposer extends GrailsComposer {

    def wnd
    def listBoxBooks
    def booksModel
    def binder

    def afterCompose = {
        booksModel = new BindingListModelList([], true)
        reloadBooks()
        binder = wnd.getVariable("binder", true)
    }

    public void onClick_btnDelete() {
        if (listBoxBooks.selectedCount > 0) {
            listBoxBooks.selectedItems.each { listItem ->
                def book = listItem.value
                book.delete(flush: true)
            }
            reloadBooks()
        }
    }

    private def reloadBooks() {
        def books = Book.list()
        booksModel.clear()
        booksModel.addAll(books)
        binder.loadAll()
    }

}
