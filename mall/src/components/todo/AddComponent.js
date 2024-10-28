import { useState } from 'react'
import { postAdd } from '../../api/todoApi'

const initState = {
  title: '',
  writer: '',
  dueDate: ''
}

const AddComponent = () => {

  const [todo, setTodo] = useState({...initState})

  const handleChangeTodo = (e) => {
    todo[e.target.name] = e.target.value
    setTodo({...todo})
  }

  const handleClickAdd = () => {
    //console.log(todo)
    postAdd(todo)
    .then(result => {
      console.log(result)
      //초기화
      setTodo({...initState})
    }).catch(e => {
      console.log(e)
    })
  }

  return (
    <div className="p-4 m-2 mt-10 border-2 border-sky-200">
      <div className="flex justify-center">
        <div className="relative flex flex-wrap items-stretch w-full mb-4">
          <div className="w-1/5 p-6 font-bold text-right">TITLE</div>
          <input className="w-4/5 p-6 border border-solid rounded-r shadow-md border-neutral-500"
                  name="title" type={'text'} vvalue={todo.title} onChange={handleChangeTodo}></input>
        </div>
      </div>
      <div className="flex justify-center">
        <div className="relative flex flex-wrap items-stretch w-full mb-4">
          <div className="w-1/5 p-6 font-bold text-right">WRITER</div>
          <input className="w-4/5 p-6 border border-solid rounded-r shadow-md border-neutral-500"
                  name="writer" type={'text'} value={todo.writer} onChange={handleChangeTodo}></input>
        </div>
      </div>
      <div className="flex justify-center">
        <div className="relative flex flex-wrap items-stretch w-full mb-4">
          <div className="flex w-1/5 p-6 font-bold text-right">DUEDATE</div>
          <input className="w-4/5 p-6 border border-solid rounded-r shadow-md border-neutral-500"
                  name="dueDate" type={'date'} value={todo.dueDate} onChange={handleChangeTodo}></input>
        </div>
      </div>
      <div className="flex justify-center">
        <div className="relative flex flex-wrap items-stretch p-4 mb-4">
          <button type="button" className="p-4 text-xl text-white bg-blue-500 rounded w-36"
                  onClick={handleClickAdd}>
            ADD
          </button>
        </div>
      </div>
    </div>
//    <>Add Component</>
  )
}

export default AddComponent;