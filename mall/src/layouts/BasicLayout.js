const BasicLayout = ({children}) => {
  return(
    <>
      <header className="p-5 bg-teal-400 ">
        <h1 className="text-2xl md:text-4xl">
          Header
        </h1>
      </header>

      <div className="flex w-full my-5 space-y-4 bg-white felx-col md:flex-row md:space-x-4 md:space-y-0">
        <main className="px-5 py-40 bg-sky-300 md:w-2/3 lg:w-3/4">
          {children}
        </main>

        <aside className="px-5 py-40 bg-green-300 md:w-1/3 lg:w-1/4">
          <h1 className="text-2xl md:text-4xl">
            Sidebar
          </h1>
        </aside>
      </div>
    </>
  );
}

export default BasicLayout;