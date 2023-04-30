package com.example.fineone_impledebug
//import TodoAdapter
//import TodoAdapter
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.fineone_impledebug.databinding.ActivityMainBinding
//import com.example.fineone_impledebug.databinding.DialogAddTodoBinding

class MainActivity : AppCompatActivity() {
    private val mBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
//    private lateinit var viewModel: TodoListViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mBinding.root)

//        val adapter = TodoAdapter(this::onTodoItemClick)
//        mBinding.todoList.adapter = adapter
//
//        viewModel = ViewModelProvider(this).get(TodoListViewModel::class.java)
//        viewModel.todoList.observe(this) { todoList ->
//            adapter.submitList(todoList)
//        }

//        mBinding.btnAddTodo.setOnClickListener {
//            val sp = getSharedPreferences("onClick", MODE_PRIVATE)
//            sp.edit().putString("SoundCode", "测点代码").apply()
//           showAddTodoDialog()
//        }

//        //获取到SP中的数据
//        btn_obtain.setOnClickListener {
//            val sp1 = getSharedPreferences("onClick", MODE_PRIVATE)
//            //如果SoundCode,获取的值是空的,则会弹出后面的默认值
//            val obtain = sp1.getString("SoundCode", "默认值")
//            Toast.makeText(this@MainActivity, obtain, Toast.LENGTH_SHORT).show()
//        }
    }

    //  private fun onTodoItemClick(todoItem: TodoItem) {

//        viewModel.deleteTodoItem(todoItem)
    // }
//    btn_save.setOnClickListener {
//        val sp = getSharedPreferences("onClick", MODE_PRIVATE)
//        sp.edit().putString("SoundCode", "测点代码").apply()
//    }
//    btn_save.setOnClickListener(new View.OnClickListener() {
//        @Override
//        public void onClick(View v) {
//            SharedPreferences sp = getSharedPreferences("onClick", MODE_PRIVATE);
//            sp.edit().putString("SoundCode","测点代码").apply();//apply才会写入到xml配置文件里面
//        }
//    });


//    private fun showAddTodoDialog() {
//        val dialogBinding = DialogAddTodoBinding.inflate(layoutInflater)
//
//        AlertDialog.Builder(this)
//            .setTitle("Add Todo")
//            .setView(dialogBinding.root)
//            .setPositiveButton("Add") { _, _ ->
//                viewModel.addTodoItem(
//                    title = dialogBinding.etTitle.text.toString(),
//                    description = dialogBinding.etDescription.text.toString()
//                )
//            }
//            .setNegativeButton("Cancel", null)
//            .show()
//    }


}
