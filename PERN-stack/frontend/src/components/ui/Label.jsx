export function Label({ children, htmlFor}) {
  return (
    <label className='block text-gray-400 text-sm font-medium mb-2' htmlFor={htmlFor}>
      {children}
    </label>
  )
}

export default Label