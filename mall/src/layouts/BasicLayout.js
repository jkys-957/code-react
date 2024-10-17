import BasicMenu from '../components/menu/BasicMenu';

const BasicLayout = ({children}) => {
  return(
    <>
      {/* 기존 헤더 대신 BasicMenu */}
      <BasicMenu />
      
      {/* <header className="p-5 bg-teal-400 ">
        <h1 className="text-2xl md:text-4xl">
          Header
        </h1>
      </header> */}

      {/* 상단 여백 my-5 제거 */}
      <div className="flex flex-col w-full bg-white md:flex-row md:space-x-1 md:space-y-0">
        <main className="px-5 py-5 bg-sky-300 md:w-4/5 lg:w-3/4">
        {/* 상단 여백 py-40 변경 md:w-2/3 변경 flex 제거(원래 없었음) */}
          {children}
        </main>

        <aside className="flex px-5 bg-green-300 md:w-1/5 lg:w-1/4">
        {/* 상단 여백 py-40 제거 md:w-1/3 변경 flex 제거(코드는 flex가 있는데?) */}
          <h1 className="text-2xl md:text-4xl">Sidebar</h1>
          
        </aside>
      </div>
    </>
  );
}

export default BasicLayout;